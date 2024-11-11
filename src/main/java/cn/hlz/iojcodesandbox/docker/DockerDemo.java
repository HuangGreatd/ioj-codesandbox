package cn.hlz.iojcodesandbox.docker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.async.ResultCallback;
import com.github.dockerjava.api.command.*;
import com.github.dockerjava.api.model.Container;
import com.github.dockerjava.api.model.Frame;
import com.github.dockerjava.api.model.PullResponseItem;
import com.github.dockerjava.core.DockerClientBuilder;
import com.github.dockerjava.core.command.LogContainerResultCallback;

import java.util.List;

/**
 * @ClassName: DockerDemo
 * @Description:dockerclient demo
 * @Author: 橘子皮
 * @Date: 2024-11-09 15:57
 * @Version: 1.0
 **/
public class DockerDemo {
    public static void main(String[] args) throws InterruptedException {
        DockerClient dockerClient = DockerClientBuilder.getInstance().build();
//        PingCmd pingCmd = dockerClient.pingCmd();
//        pingCmd.exec();
        //拉取镜像
        String image = "nginx:latest";
        PullImageCmd pullImageCmd = dockerClient.pullImageCmd(image);
//        PullImageResultCallback pullImageResultCallback = new PullImageResultCallback() {
//            @Override
//            public void onNext(PullResponseItem item) {
//                super.onNext(item);
//            }
//        };
//        ResultCallback.Adapter<PullResponseItem> pullResponseItemAdapter =
//                pullImageCmd.exec(pullImageResultCallback)
//                        .awaitCompletion();
//        System.out.println("下载完成");

        //创建容器
        CreateContainerCmd containerCmd = dockerClient.createContainerCmd(image);
        CreateContainerResponse exec = containerCmd.withCmd("echo", "Hello docker")
                .exec();
        System.out.println("exec = " + exec);
        String containerId = exec.getId();
        //查看容器状态
        ListContainersCmd listContainersCmd = dockerClient.listContainersCmd();
        List<Container> exec1 = listContainersCmd.withShowAll(true).exec();
        for (Container container : exec1) {
            System.out.println("container = " + container);
        }

        //启动容器
        dockerClient.startContainerCmd(containerId).exec();

//        Thread.sleep(1000l);
        //查看日志
        LogContainerResultCallback logContainerResultCallback = new LogContainerResultCallback() {
            @Override
            public void onNext(Frame item) {
                System.out.println("item" + item.getStreamType());
                System.out.println("日志" + item.getPayload());
                super.onNext(item);
            }
        };
        dockerClient.logContainerCmd(containerId).withStdErr(true)
                .withStdOut(true).exec(logContainerResultCallback).awaitCompletion();
    }
}

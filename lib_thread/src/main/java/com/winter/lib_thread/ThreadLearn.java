package com.winter.lib_thread;


import java.util.concurrent.Callable;

/**
 * 进程 ： 操作系统分配资源的最小单位
 * 线程 ： cpu调度的最小单位，不能够独立存在 必须依赖于进程存在
 * cpu核心数 windows中 内核4 逻辑处理器8
 * cpu时间片轮转机制--> RR调度  cpu执行一条指令 0.6ns
 *
 * 并行和并发
 * 并发要跟时间依赖  交替执行  ->时间片轮转机制
 * 同时执行不同的任务
 *
 * 优点
 * 充分利用cpu的资源
 * 代码 模块化 异步化 简单化
 *
 * 缺点
 * 线程安全问题
 * 引入锁。可能引起锁。造成性能损失
 *
 * os
 * Linux 一个进程1000个线程限制 句柄 文件描述符1024个
 * windows 一个进程2000个线程限制
 * 每一个线程需要分配栈空间1M
 *
 * 线程池
 *
 * 新起线程的方式
 * new Thread 和 runnable、callable。thread源码中写明two ways
 *
 * stop
 * 线程所占用的资源来不及释放
 *
 * interrupt  线程的中断标识位  线程是协作式 不是 抢占式
 * 中断线程的标识
 * isInterrupt 判断是否有中断标识
 * static isInterrupt 判断是否有中断标识 并且把标识改成false
 *
 * start->就绪状态(可执行状态)->等待cpu时间片轮转->运行状态->run执行完毕 stop->死亡
 * join方法获取执行权
 * yield让出执行权
 *
 * yield 不会释放锁
 * join
 * 如何让两个线程 顺序执行。join方法
 *
 *
 * synchronized 同步锁  锁的式对象 要保证对象不发生变化
 *
 * volatile 最轻量的同步机制  保证可见性 不保证原子性
 *
 * ThreadLocal
 */
public class ThreadLearn {

}
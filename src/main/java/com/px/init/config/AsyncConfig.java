package com.px.init.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * <pre>
 * Class : AsyncConfig
 * Comment : 비동기 함수를 사용하기 위한 설정 파일
 * History
 * 2022-10-08 (손창우) 처음 작성
 * </pre>
 *
 * @author 손창우
 * @version 1.0
 */
@EnableAsync
@Configuration
public class AsyncConfig extends AsyncConfigurerSupport {

    public Executor getAsyncExecutor(){
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        //기본 실행 대기하는 쓰레드 수
        executor.setCorePoolSize(5);
        // 동시 동작 쓰레드 최대 수
        executor.setMaxPoolSize(30);
        // 동시 동작 쓰레드 초과 시 대기 큐에 저장할 수용 용량
        executor.setQueueCapacity(50);
        // 쓰레드 이름 접두사
        executor.setThreadNamePrefix("INIT-");
        executor.initialize();
        return executor;
    }



}

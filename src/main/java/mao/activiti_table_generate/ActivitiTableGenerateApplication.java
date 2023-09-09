package mao.activiti_table_generate;

import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngines;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ActivitiTableGenerateApplication
{
    private static final Logger log = LoggerFactory.getLogger(ActivitiTableGenerateApplication.class);

    public static void main(String[] args)
    {
        SpringApplication.run(ActivitiTableGenerateApplication.class, args);
        log.info("开始生成");
        //使用classpath下的activiti.cfg.xml中的配置创建processEngine
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        log.debug(processEngine.toString());
        log.info("生成结束");
    }

}

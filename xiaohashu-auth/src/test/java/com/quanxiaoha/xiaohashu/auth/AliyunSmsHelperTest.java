package com.quanxiaoha.xiaohashu.auth;

import com.aliyun.dysmsapi20170525.Client;
import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.teautil.models.RuntimeOptions;
import com.quanxiaoha.xiaohashu.auth.sms.AliyunSmsHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AliyunSmsHelperTest {


    @Autowired
    private AliyunSmsHelper aliyunSmsHelper;



    @Test
    void testSendMessage_Success() {
        String signName = "阿里云短信测试";
        String templateCode = "SMS_154950909";
        String phone = "19307499690";
        String templateParam = "{\"code\":\"123456\"}";

        boolean result = aliyunSmsHelper.sendMessage(signName, templateCode, phone, templateParam);

        assertTrue(result, "短信应发送成功");
    }
}

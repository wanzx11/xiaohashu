package com.quanxiaoha.xiaohashu.oss.biz.strategy;

import org.springframework.web.multipart.MultipartFile;


public interface FileStrategy {

    /**
     * 文件上传
     */
    String uploadFile(MultipartFile file, String bucketName);

}


//package com.libertymutual.goforcode.tests3.api;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import amazon.s3.AmazonS3Template;
//import com.amazonaws.services.s3.model.*;
//
///**
// * This class auto-configures a {@link AmazonS3Template} bean.
// *
// * @author kbastani
// */
//@Configuration
//@ConditionalOnMissingBean(AmazonS3Template.class)
//@EnableConfigurationProperties(AmazonProperties.class)
//public class S3AutoConfiguration {
//
//    @Autowired
//    private AmazonProperties amazonProperties;
//
//    @Bean
//    AmazonS3Template amazonS3Template() {
//        return new AmazonS3Template(amazonProperties.getS3().getDefaultBucket(),
//                amazonProperties.getAws().getAccessKeyId(),
//                amazonProperties.getAws().getAccessKeySecret());
//    }
//}

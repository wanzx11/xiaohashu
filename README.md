xiaohashu/                                    # 项目根目录
├── .idea/                                    # IDEA配置目录
├── .git/                                     # Git配置目录
├── .gitignore                                # Git忽略文件
├── pom.xml                                   # 项目主POM文件
│
├── xiaohashu-auth/                          # 认证服务模块
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/quanxiaoha/auth/
│   │   │   │       ├── controller/          # 控制器层
│   │   │   │       ├── service/             # 服务层
│   │   │   │       ├── mapper/              # 数据访问层
│   │   │   │       ├── model/               # 数据模型
│   │   │   │       └── config/              # 配置类
│   │   │   └── resources/
│   │   │       ├── application.yml          # 应用配置
│   │   │       └── application-dev.yml      # 开发环境配置
│   │   └── test/                            # 测试目录
│   └── pom.xml                              # 认证服务POM文件
│
├── xiaoha-framework/                        # 框架模块
│   ├── xiaoha-common/                      # 通用工具模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── com/quanxiaoha/common/
│   │   │   │   │       ├── annotation/      # 自定义注解
│   │   │   │   │       │   ├── DataMask.java
│   │   │   │   │       │   └── ApiVersion.java
│   │   │   │   │       │
│   │   │   │   │       ├── config/          # 通用配置
│   │   │   │   │       │   ├── WebMvcConfig.java
│   │   │   │   │       │   ├── SwaggerConfig.java
│   │   │   │   │       │   └── CorsConfig.java
│   │   │   │   │       │
│   │   │   │   │       ├── constant/        # 常量定义
│   │   │   │   │       │   ├── CommonConstant.java
│   │   │   │   │       │   ├── HttpStatus.java
│   │   │   │   │       │   └── RegexConstant.java
│   │   │   │   │       │
│   │   │   │   │       ├── exception/       # 异常处理
│   │   │   │   │       │   ├── BusinessException.java
│   │   │   │   │       │   ├── GlobalExceptionHandler.java
│   │   │   │   │       │   └── ErrorCode.java
│   │   │   │   │       │
│   │   │   │   │       ├── model/           # 通用模型
│   │   │   │   │       │   ├── BaseEntity.java
│   │   │   │   │       │   ├── PageQuery.java
│   │   │   │   │       │   └── BaseDTO.java
│   │   │   │   │       │
│   │   │   │   │       ├── util/            # 工具类
│   │   │   │   │       │   ├── StringUtils.java
│   │   │   │   │       │   ├── DateUtils.java
│   │   │   │   │       │   ├── JsonUtils.java
│   │   │   │   │       │   └── SecurityUtils.java
│   │   │   │   │       │
│   │   │   │   │       └── response/        # 统一响应处理
│   │   │   │   │           ├── Result.java
│   │   │   │   │           ├── ResultCode.java
│   │   │   │   │           └── PageResult.java
│   │   │   │   │
│   │   │   │   └── resources/
│   │   │   │       └── application-common.yml
│   │   │   │
│   │   │   └── test/                        # 测试目录
│   │   │       └── java/
│   │   │           └── com/quanxiaoha/common/
│   │   │               └── util/
│   │   │                   └── StringUtilsTest.java
│   │   │
│   │   └── pom.xml                         # 通用模块POM文件
│   │
│   ├── xiaoha-spring-boot-starter-biz-operationlog/  # 操作日志模块
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   ├── java/
│   │   │   │   │   └── com/quanxiaoha/log/
│   │   │   │   │       ├── annotation/      # 日志注解
│   │   │   │   │       │   ├── OperationLog.java
│   │   │   │   │       │   └── LogType.java
│   │   │   │   │       │
│   │   │   │   │       ├── aspect/          # AOP切面
│   │   │   │   │       │   ├── OperationLogAspect.java
│   │   │   │   │       │   └── LogPointcut.java
│   │   │   │   │       │
│   │   │   │   │       ├── config/          # 日志配置
│   │   │   │   │       │   ├── OperationLogAutoConfiguration.java
│   │   │   │   │       │   └── LogProperties.java
│   │   │   │   │       │
│   │   │   │   │       ├── model/           # 日志模型
│   │   │   │   │       │   ├── OperationLogDO.java
│   │   │   │   │       │   └── LogContext.java
│   │   │   │   │       │
│   │   │   │   │       └── service/         # 日志服务
│   │   │   │   │           ├── OperationLogService.java
│   │   │   │   │           └── impl/
│   │   │   │   │               └── OperationLogServiceImpl.java
│   │   │   │   │
│   │   │   │   └── resources/
│   │   │   │       ├── META-INF/
│   │   │   │       │   └── spring.factories
│   │   │   │       └── application-log.yml
│   │   │   │
│   │   │   └── test/                        # 测试目录
│   │   │       └── java/
│   │   │           └── com/quanxiaoha/log/
│   │   │               └── service/
│   │   │                   └── OperationLogServiceTest.java
│   │   │
│   │   └── pom.xml                         # 日志模块POM文件
│   │
│   └── pom.xml                             # 框架模块POM文件

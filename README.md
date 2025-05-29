xiaoha-framework/
├── xiaoha-common/                    # 通用工具模块
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/quanxiaoha/common/
│   │   │   │       ├── annotation/   # 自定义注解
│   │   │   │       ├── config/       # 通用配置
│   │   │   │       ├── constant/     # 常量定义
│   │   │   │       ├── exception/    # 异常处理
│   │   │   │       ├── model/        # 通用模型
│   │   │   │       ├── util/         # 工具类
│   │   │   │       └── response/     # 统一响应处理
│   │   │   └── resources/
│   │   └── test/
│   └── pom.xml
│
├── xiaoha-spring-boot-starter-biz-operationlog/  # 操作日志模块
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/quanxiaoha/log/
│   │   │   │       ├── annotation/   # 日志注解
│   │   │   │       ├── aspect/       # AOP切面
│   │   │   │       ├── config/       # 日志配置
│   │   │   │       ├── model/        # 日志模型
│   │   │   │       └── service/      # 日志服务
│   │   │   └── resources/
│   │   │       └── META-INF/
│   │   │           └── spring.factories
│   │   └── test/
│   └── pom.xml
│
└── pom.xml

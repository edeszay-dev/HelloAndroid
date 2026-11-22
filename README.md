# HelloAndroid — Android 开发基础实验（实验一）

福建师范大学软件工程专业 **Android 开发基础实验** 首个示例工程，完成 Android Studio 工程创建、基础界面交互、`Android.gitignore` 配置与 GitHub 同步。

## 开发环境

- **IDE**：Android Studio（推荐 2024.2+ / Quail 4, 2026.1.4）
- **开发语言**：Java 17
- **构建工具**：Gradle 8.9 / Android Gradle Plugin 8.7.3
- **SDK 配置**：`compileSdk 35` / `targetSdk 35` / `minSdk 24`（Android 7.0+）

## 工程结构

```text
HelloAndroid/
├── .gitignore                                  # 参考 github/gitignore 的 Android.gitignore
├── build.gradle                                # 根项目 Gradle 插件配置
├── settings.gradle                             # 仓库与模块配置
├── gradle.properties                           # AndroidX 与 JVM 参数
├── gradle/wrapper/gradle-wrapper.properties    # Gradle Wrapper 版本声明
└── app/
    ├── build.gradle                            # app 模块编译与依赖配置
    └── src/main/
        ├── AndroidManifest.xml                 # 应用清单与启动 Activity 声明
        ├── java/cn/edu/fjnu/se/helloandroid/
        │   └── MainActivity.java               # 主界面与点击计数交互逻辑
        └── res/
            ├── layout/activity_main.xml        # Material 风格主界面布局
            └── values/                         # 颜色、字符串与主题资源
```

## 运行方式

1. 使用 Android Studio 打开 `HelloAndroid` 根目录。
2. 等待 Gradle Sync 自动同步依赖库（如国内网络较慢，可在 `settings.gradle` 中配置镜像源）。
3. 连接真机或启动 AVD 模拟器，点击 **Run (`Shift + F10`)** 运行应用。

## 参考资料

- [Android Developers 官方文档](https://developer.android.google.cn/develop/index.html)
- [应用基础知识](https://developer.android.google.cn/guide/components/fundamentals.html)
- [GitHub 官方 Android.gitignore](https://github.com/github/gitignore/blob/main/Android.gitignore)

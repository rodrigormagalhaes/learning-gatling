## Learning Gatling Performance Test

- **Pré requisitos**:
  - [Java](https://www.java.com/pt_BR/download/)  
  - Instalar Plugin Scala no IntelliJ: `File` > `Settings` > `Plugins` > `Scala`
  - [Configuração JVM](https://gatling.io/docs/current/installation#intellij-idea): `File` > `Settings` > `Scala Compile Server`: `JVM Options` = `-server -Xss100M`
  - Importar o projeto no IntelliJ como projeto gradle

```
./gradlew clean gatlingRun-CreateUserSimulation
```

- **Relatório html**: 
  > ./build/reports/gatling/

#### Referências

- [Gatling](https://gatling.io/)
- [Quick Start](https://gatling.io/docs/current/quickstart)
- [Gatling Cheat Sheet](https://gatling.io/docs/current/cheat-sheet/)
- [Gatling Plugin for Gradle](https://github.com/lkishalmi/gradle-gatling-plugin)
- [Configuração de execução de cenários](https://gatling.io/docs/current/general/simulation_setup/#open-model)
- [Execução distrubuída](https://gatling.io/docs/current/cookbook/scaling_out)
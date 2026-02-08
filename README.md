# 🧮 Calculadora Java com Interface Gráfica

Calculadora desenvolvida em **Java**, com **interface gráfica (Swing)**, criada com foco no aprendizado de **Programação Orientada a Objetos** e execução **independente de IDE**.

O projeto pode ser executado em **qualquer máquina** que possua o **JDK instalado**, diretamente pelo **terminal**.

---

## 📌 Funcionalidades

- Interface gráfica em Java Swing  
- Operações matemáticas básicas  
  - Adição  
  - Subtração  
  - Multiplicação  
  - Divisão  
- Organização do código em pacotes  
- Execução via arquivo `.jar`

---

## 🛠️ Tecnologias Utilizadas

- Java (JDK 21 LTS)
- Java Swing
- Terminal (PowerShell, CMD, Linux ou macOS)

---

## 📂 Estrutura do Projeto
CalculadoraJava <br>
├── src <br>
 │ └── calc <br>
 │ │ └── visao <br>
 │ │ └── modelo <br>
└── meta-inf <br>
│ └── MANIFEST.MF <br>

---

## ✅ Pré-requisitos

- JDK instalado
- Java configurado no PATH

## ▶️ Como Executar o Projeto

### 1️⃣ Clonar o repositório

```bash
git clone https://github.com/GabrielRogerDelano/CalculadoraJava.git

```
```bash
cd CalculadoraJava

```
### 2️⃣ Compilar o projeto
Windows (PowerShell)
```bash
javac -d bin (Get-ChildItem -Recurse -Filter *.java | ForEach-Object { $_.FullName })
```
Linux / macOS
```bash
javac -d bin $(find src -name "*.java")
```


### 3️⃣ Criar o arquivo JAR executável
```bash
jar cfm CalculadoraJava.jar meta-inf/MANIFEST.MF -C bin .
```

### 4️⃣ Executar a aplicação
```bash
java -jar CalculadoraJava.jar
```


![Image](https://github.com/user-attachments/assets/79594e59-3ccc-4325-a0bc-74056e0f8544)
---

## 📝 Licença

Este projeto esta sobe a licença [MIT](./LICENSE).

Feito por Gabriel Roger Delano👋🏽 <a href="https://www.linkedin.com/in/gabrielrogerdelano/"> Entre em contato!</a>

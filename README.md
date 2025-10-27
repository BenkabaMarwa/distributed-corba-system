# Distributed CORBA System

This project demonstrates a **distributed client-server architecture** built using **CORBA (Common Object Request Broker Architecture)**.  
It allows communication between a client and a server over a distributed network, enabling **remote method invocation** across different machines.

---

## 🧠 About CORBA

CORBA (Common Object Request Broker Architecture) is a middleware technology that allows programs written in different languages and running on different platforms to work together as if they were in the same system.

---

## 🧩 Project Structure

├── clientCORBA/ → Contains the CORBA client implementation
├── serverCORBA/ → Contains the CORBA server implementation
└── README.md

---

## 🚀 Features
- Remote Object Communication using CORBA
- Object registration and lookup via ORB (Object Request Broker)
- Separation between client and server logic
- Platform-independent communication

---

## 🛠️ Technologies Used
- **Java CORBA API**
- **IDL (Interface Definition Language)**
- **Eclipse IDE**

---

## ⚙️ How to Run

### 1️. Compile the IDL file
  ```bash
  idlj -fall MyInterface.idl
  ```

### 2. Start the ORB naming service
  ```bash
  tnameserv -ORBInitialPort 1050
  ```

### 3. Run the server
  ```bash
  java serverCorba.Server
  ```

### 4. Run the client
  ```bash
  java clientCorba.Client
  ```

---

## 👩‍💻 Author
Benkaba Marwa

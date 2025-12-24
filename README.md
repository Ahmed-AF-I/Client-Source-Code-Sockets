# 🌐 Smart Network Chat System (Java Sockets)
> A full-stack networking project featuring a multi-threaded server and an interactive client using TCP/IP Sockets.

<p align="center">
  <img src="https://img.shields.io/badge/Java-11%2B-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/Architecture-Client--Server-blue?style=for-the-badge" />
  <img src="https://img.shields.io/badge/Networking-TCP--IP-green?style=for-the-badge" />
</p>

---

## 📖 Overview
This system facilitates real-time communication between a centralized server and multiple remote clients. The server is designed to handle concurrent connections using **Multi-threading**, while the client provides a seamless command-line interface to interact with a **Smart Reply Engine**.



## 🛠 Core Features
### **Server Side**
* **Concurrency:** Uses a `Thread-per-client` model via `SocketHandler`.
* **Smart Processing:** Integrates `SmartReplyEngin` to analyze and respond to messages.
* **Auto-Flush:** Ensures real-time data delivery using `PrintWriter(out, true)`.
* **Connection Monitoring:** Keeps a live count of active users.

### **Client Side**
* **Interactive CLI:** Easy-to-use interface for sending and receiving messages.
* **Graceful Exit:** Supports local and server-initiated termination (using the 'exit' command).
* **Robust Error Handling:** Detects server disconnections and network timeouts.

---

## ⚙️ Technical Configuration
| Component | Details |
| :--- | :--- |
| **Default Port** | `7777` |
| **Server IP** | `192.168.0.199` (Configurable in Client) |
| **Protocol** | TCP (Transmission Control Protocol) |
| **Java Version** | JDK 11 or higher |

---

## 🚀 How to Run

Follow these steps to set up the communication environment:

### 1. Start the Server
Navigate to the server project directory and run:
```bash
# Compile
javac com/seniorsteps/network/Main.java
# Run
java com.seniorsteps.network.Main

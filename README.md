# 🚀 HyperSync: High-Concurrency Real-Time Quiz Engine

**HyperSync** is an industrial-grade, multi-threaded JavaFX desktop application designed to conduct real-time competitive quizzes for up to **150+ concurrent users** without any latency.

---

## 🎯 Project Objectives
- **Scalability:** Handle 150+ simultaneous student connections using a custom Thread Pool.
- **Real-Time Interaction:** Zero-lag synchronization between the Server (Teacher) and Clients (Students).
- **Modern UI:** A sleek, dark-themed JavaFX interface with smooth animations.
- **Robustness:** Advanced exception handling to manage sudden disconnections and data integrity.

---

## 🛠️ Tech Stack & Mandatory Components
- **Language:** Java (JDK 17+)
- **GUI Framework:** JavaFX (with CSS for Modern UI)
- **Concurrency:** Multi-threading (ExecutorService, Thread Pools)
- **Networking:** Java Sockets (TCP/IP)
- **Data Handling:** Custom Exception Handling & OOP Architecture

---

## 🏗️ System Architecture
The project follows the **Client-Server Architecture**:
1. **HyperSync Server:** Managed by the host, it handles connection requests, manages the question bank, and broadcasts live scores.
2. **HyperSync Client:** A lightweight application for students to join the lobby, answer questions, and view the live leaderboard.

---

## 👥 Team & Responsibilities (Team Size: 3)
- **Member 1 (Lead Developer):** Network Architecture, Socket Programming & Threading Logic.
- **Member 2 (UI/UX Designer):** JavaFX Layouts (FXML), CSS Styling & Transitions.
- **Member 3 (System Architect):** OOP Structure, Game Logic & Exception Handling.

---

## 🚀 Key Features
- [x] **150+ Concurrent Connections:** Optimized using `FixedThreadPool`.
- [x] **Dynamic Leaderboard:** Real-time ranking updates using JavaFX animations.
- [x] **Adaptive Timer:** Synchronized countdown for all participants.
- [x] **Fault Tolerance:** Graceful handling of `ConnectionLostException` and `ServerFullException`.

---

## 📂 Project Structure
```text
/src
  ├── /server      # Server-side logic (Sockets, Threading)
  ├── /client      # Client-side logic (UI Controllers, Listeners)
  ├── /models      # OOP Classes (Player, Question, Result)
  └── /utils       # Custom Exceptions & Constants
/resources
  ├── /layout      # FXML View files
  └── /styles      # CSS for Modern Dark Mode

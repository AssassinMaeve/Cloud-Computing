# Cloud-Computing: Java RMI Lab Records

This repository contains Java RMI (Remote Method Invocation) programs developed as part of the MSc Software Technology coursework on Cloud Computing. It gathers lab records, sample implementations, and notes related to RMI in a distributed/ cloud-oriented setting.

---

## 📁 Repository Structure

```
Cloud-Computing/
│
├── LabRecords/
│   └── RMI/              ← Java RMI programs and exercises
│
├── Notes/                 ← Conceptual notes, design considerations, architecture diagrams
│
└── README.md              ← This file
```

* `LabRecords/RMI/` contains working Java projects, each demonstrating a particular RMI scenario—such as client-server remote method invocation, registry setup, error handling, custom remote interfaces, and so on.
* `Notes/` contains supporting documentation: theory, best practices, cloud-computing integration notes, etc.

---

## 🎯 Key Features

* Implements remote interfaces for distributed services using Java RMI.
* Demonstrates client-server architecture:

  * Server side: binds remote objects to the RMI registry.
  * Client side: looks up remote objects, invokes methods, handles responses and exceptions.
* Includes input validation and error handling (for example, invalid inputs in remote methods).
* Applies the concepts of cloud/distributed computing: decoupling, remote invocation, modularization.

---

## 🧩 Example Usage

Here’s a simple workflow to run one of the RMI programs:

1. Open the project in your IDE (e.g., Eclipse, IntelliJ) or compile via command-line.
2. Start the RMI registry (for example, in the project folder):

   ```bash
   rmiregistry 1099
   ```

   (Or `LocateRegistry.createRegistry(1099)` in code.)
3. Launch the server class (e.g., `Server.java`), which creates and binds a remote object.
4. Run the client class (e.g., `Client.java`), provide input (via console) and observe remote invocation results.
5. For invalid inputs, the system prints appropriate error messages instead of failing silently.

---

## ✅ Best Practices & Notes

* Ensure both server and client use the **same remote interface definition** (method signatures, exceptions) to avoid `ClassNotFoundException` or `UnmarshalException`.
* Stick to matching Java versions for server and client to avoid serialization compatibility issues.
* When deploying in a cloud/distributed environment beyond local machine, consider:

  * Security manager or policy files (if you enable RMI security).
  * Network/firewall settings for RMI ports.
  * Naming conventions in the RMI registry (unique service names).
* Validate inputs **before** remote invocation to avoid unnecessary network traffic or remote exceptions.

---

## 📘 Topics Covered

* Java RMI basics: remote interfaces, registry.
* Client-server design using RMI.
* Input validation and error handling in a distributed context.
* Integration of RMI concepts into a cloud/distributed computing curriculum framework.

---

## ✏️ License & Acknowledgements

This repository is created for academic purposes as part of an MSc Software Technology programme. Feel free to **fork**, **modify** or **adapt** it for your own learning and lab work.
Acknowledgements to the course instructors and reference materials used in the cloud computing lab sessions.

---

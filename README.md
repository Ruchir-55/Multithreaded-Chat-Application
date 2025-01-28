# Multithreaded-Chat-Application

*COMPANY* : CODTECH IT SOLUTIONS 

*NAME* : RUCHIR SUKHATANKAR

*INTERN ID* : CT08KKY

*DOMAIN NAME* : JAVA PROGRAMMING

*BATCH DURATION* : JANUARY 10th, 2024 to FEBRUARY 10th, 2024

*MENTOR NAME* : NEELA SANTOSH KUMAR

*DESCRIPTION OF TASK PERFORMED* :

# 1. *Server (ChatServer):*
- The server listens for incoming client connections on a specific port (12345).
- For each new client connection, a new ClientHandler is created, which is responsible for reading and sending messages to the client.
- All connected clients are stored in a Set (clientHandlers), and messages are broadcasted to all clients using the broadcastMessage method.
- When a client disconnects (or sends an "exit" command), the server removes the client from the list of active clients.

# 2. *Client (ChatClient):*
- The client connects to the server at the specified address (localhost and port 12345).
- A separate thread (MessageListener) is used to listen for incoming messages from the server and display them to the user.
- The main thread reads user input from the console and sends it to the server.
- The client sends messages to the server, and upon receiving messages from the server, it displays them in the console.

# OUTPUT OF THE TASK

![Image](https://github.com/user-attachments/assets/d6968bbd-fd25-4778-9e96-f867250870e7)
![Image](https://github.com/user-attachments/assets/aeacd368-f2e5-4ab1-91dc-a34f10c49ac8)



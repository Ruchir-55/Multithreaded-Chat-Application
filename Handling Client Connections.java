// Inside the thread created for each client connection
try {
    DataInputStream dataIn = new DataInputStream(connectionSocket.getInputStream());
    DataOutputStream dataOut = new DataOutputStream(connectionSocket.getOutputStream());
    
    // Read client input: two numbers and an operator
    Float num1 = Float.parseFloat(dataIn.readUTF());
    Float num2 = Float.parseFloat(dataIn.readUTF());
    String operator = dataIn.readUTF();
    
    // Perform the requested calculation
    switch (operator) {
      case "A": // A is for addition
        dataOut.writeUTF("" + (num1 + num2));
        break;
      case "S": // S is for subtraction
        dataOut.writeUTF("" + (num1 - num2));
        break;
      case "M": // M is for Multiplication
        dataOut.writeUTF("" + (num1 * num2));
        break;
      case "D": // D is for Division
        dataOut.writeUTF("" + (num1 / num2));
        break;
    }
    connectionSocket.close();
  } catch (IOException e) {
    e.printStackTrace();
  }
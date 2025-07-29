public String front22(String str) {
     String front = str.length() >= 2 ? str.substring(0, 2) : str;
        return front + str + front;
    
}

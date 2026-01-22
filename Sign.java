public class Sign {
    
    String message;
    int width;

    public Sign(String message, int width) {
        this.message = message;
        this.width = width;

    }
    public int numberOfLines() {
        if(message.length() == 0) return 0;
    }

    public String getLines() {
        if (message.length() == 0) return null;
    }

   
    }


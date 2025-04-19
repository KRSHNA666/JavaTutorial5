interface VoiceAssistant {
    default void respond() {
        System.out.println("Responding via voice.");
    }
}

interface ChatAssistant {
    default void respond() {
        System.out.println("Responding via chat.");
    }
}

public class SmartAssistant implements VoiceAssistant, ChatAssistant {

    // Override respond() to resolve the conflict
    @Override
    public void respond() {
        // You can choose how to respond here, or call specific interface versions:
        System.out.println("SmartAssistant handling response:");
        VoiceAssistant.super.respond();  // optionally call one or both
        ChatAssistant.super.respond();   // optionally call one or both
    }

    public static void main(String[] args) {
        SmartAssistant assistant = new SmartAssistant();
        assistant.respond();
    }
}

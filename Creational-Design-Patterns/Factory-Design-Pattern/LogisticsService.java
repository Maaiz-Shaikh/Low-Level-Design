interface Logistics {
    void send();
}

class Air implements Logistics {
    @Override
    public void send() {
        System.out.println("Sending via Air");
    }
}

class Road implements Logistics {
    @Override
    public void send() {
        System.out.println("Sending via Road");
    }
}

class LogisticsFactory {
    public static Logistics getLogistics(String type) {
        switch (type.toLowerCase()) {
            case "air":
                return new Air();

            case "road":
                return new Road();

            default:
                return new Road();
        }
    }

}

public class LogisticsService {
    public static void main(String[] args) {
        LogisticsService logisticsService = new LogisticsService();
        logisticsService.send("air");
        logisticsService.send("road");
        logisticsService.send("train");
    }

    public void send(String type) {
        Logistics logistics = LogisticsFactory.getLogistics(type);
        logistics.send();
    }

}
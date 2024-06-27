package tradeproject;

/*import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class MarketTrader {
    static Map<String, SortedSet<Order>> orders = new HashMap<>();
    static SortedSet<Trade> trades = new TreeSet<>();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // System.out.println("Before");

        // try {
        //     for (int i = 0; i < 100000000; i++) {
        //         if (i == 500) {
        //             int result = i / 0;
        //         } else {
        //             int result = (int) (i / (Math.random() * 10) + 1);
        //         }
        //     }
        // } catch (ArithmeticException e) {
        //     System.err.println(e.getMessage());
        // }

        // System.out.println("After");
        boolean go = true;
        while (go) {
            System.out.println("Enter name:");
            String user = in.nextLine();
            orders.putIfAbsent(user, new TreeSet<>());

            System.out.println(
                    "1. Display orders\n" +
                            "2. Display trades\n" +
                            "3. Place order\n");
            String doNext = in.nextLine();
            if (doNext.equals("1")) {
                for (String key : orders.keySet()) {
                    System.out.println("==" + key + "==");
                    for (Order value : orders.get(key)) {
                        System.out.println(value);
                    }
                }
            } else if (doNext.equals("2")) {
                for (Trade trade : trades) {
                    System.out.println(trade);
                }
            } else if (doNext.equals("3")) {

                Order order = null;
                try {
                    order = createOrder(in);
                } catch (InvalidOrderException e) {
                    System.err.println(e.getMessage());
                }
                if (order != null) {
                    SortedSet<Order> usersOrders = orders.get(user);
                    usersOrders.add(order);
                    matchOrders(user, order);
                }

            }
        }
    }

    static Order createOrder(Scanner in) throws InvalidOrderException {
        System.out.println("Symbol?");
        String symbol = in.nextLine();
        System.out.println("Quantity?");
        int quantity = Integer.parseInt(in.nextLine());
        System.out.println("Buy/Sell?");
        Side side = Side.valueOf(in.nextLine());
        System.out.println("Price");
        double price = Double.parseDouble(in.nextLine());
        if (quantity < 1 || price <= 0) {
            throw new InvalidOrderException("Quantity or Price are not valid");
        }
        Order order = new Order(symbol, quantity, price, side);
        return order;
    }

    static void matchOrders(String user, Order order) {
        for (String key : orders.keySet()) {
            if (!key.equals(user)) {
                if (order.getStatus() == Status.Filled) {
                    break;
                }
                for (Order otherOrder : orders.get(key)) {
                    if (otherOrder.getSymbol().equals(order.getSymbol()) &&
                            otherOrder.getStatus() != Status.Filled &&
                            otherOrder.getSide() != order.getSide()) {
                        Order buyOrder;
                        Order sellOrder;
                        if (order.getSide() == Side.Buy) {
                            buyOrder = order;
                            sellOrder = otherOrder;
                        } else {
                            buyOrder = otherOrder;
                            sellOrder = order;
                        }
                        if (buyOrder.getPrice() >= sellOrder.getPrice()) {
                            Trade trade = crossOrders(buyOrder, sellOrder);
                            trades.add(trade);
                        }
                        if (order.getStatus() == Status.Filled) {
                            break;
                        }
                    }
                }
            }
        }

    }

    static Trade crossOrders(Order buy, Order sell) {
        int buyQuant = buy.getQuantity();
        int sellQuant = sell.getQuantity();

        int amountOff = buyQuant > sellQuant ? sellQuant : buyQuant;
        buy.setQuantity(buy.getQuantity() - amountOff);
        sell.setQuantity(sell.getQuantity() - amountOff);
        if (buy.getQuantity() == 0) {
            buy.setStatus(Status.Filled);
        } else {
            buy.setStatus(Status.PartiallyFilled);
        }
        if (sell.getQuantity() == 0) {
            sell.setStatus(Status.Filled);
        } else {
            sell.setStatus(Status.PartiallyFilled);
        }

        Trade trade = new Trade(buy.getSymbol(), amountOff, buy.getPrice());
        return trade;
    }
}

class InvalidOrderException extends Exception {

    public InvalidOrderException(String message, Throwable baseException) {
        super(message, baseException);
    }
    public InvalidOrderException(String message) {
        super(message);
    }
}*/
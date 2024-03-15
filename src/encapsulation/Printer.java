package encapsulation;

public class Printer {

    public static void main(String[] args) {

//        Printer printer = new Printer(50, false);
//        System.out.println("initial page count = " + printer.getPagesPrinted());
//
//        int pagesPrinted = printer.printPages(5);
//        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());
//
//        pagesPrinted = printer.printPages(10);
//        System.out.printf("Current Job Pages: %d, Printer Total: %d %n", pagesPrinted, printer.getPagesPrinted());

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = "
                + printer.getPagesPrinted());
    }

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerAmount > 100) {
            return -1; // Invalid toner amount
        }

        int tempAmount = tonerLevel + tonerAmount;
        if (tempAmount > 100) {
            return -1; // Adding toner exceeds maximum toner level
        }

        tonerLevel += tonerAmount;
        return tonerLevel;
    }


    public int printPages(int pages) {
        int jobPages = (duplex) ? (pages / 2) + (pages % 2) : pages;
        pagesPrinted += jobPages;
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}

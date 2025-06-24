package EncapsulationChallenge;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplex) {
        if (tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount <= 0 || tonerLevel + tonerAmount > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int printPages(int pages) {
        int pagesToPrint = duplex ? (pages + 1) / 2 : pages;

        int tonerNeeded = pagesToPrint * 5; // assuming 5 units toner per page

        if (tonerLevel >= tonerNeeded) {
            tonerLevel -= tonerNeeded;
            pagesPrinted += pages;
            System.out.println(duplex ? "Printer is duplex" : "Printer is simplex");
            return pagesToPrint;
        } else {
            System.out.println("Not enough toner to print.");
            return 0;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}

package SeaBattle;

public enum Symbols {
    SHIP("🚢"), WATER("🌊"), MISS("❌"), DAMAGE("💥"), OREOL("🛑");
    
    private final String symbol;

    Symbols (String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return symbol;
    }
}

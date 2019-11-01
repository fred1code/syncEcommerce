


public class ProductResponse {

    private String productId;
    private String stockId;

    public ProductResponse() {
    }

    public ProductResponse(String productId, String stockId) {
        this.productId = productId;
        this.stockId = stockId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

}

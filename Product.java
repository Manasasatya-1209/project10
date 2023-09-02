package model;

public class Product {
        private int prod_id;
        private String prod_name;
        private int minSellQuantity;
        private int prod_price;
        private int prod_quantity;
		public int getProd_id() {
			return prod_id;
		}
		public void setProd_id(int prod_id) {
			this.prod_id = prod_id;
		}
		public String getProd_name() {
			return prod_name;
		}
		public void setProd_name(String prod_name) {
			this.prod_name = prod_name;
		}
		public int getMinSellQuantity() {
			return minSellQuantity;
		}
		public void setMinSellQuantity(int minSellQuantity) {
			this.minSellQuantity = minSellQuantity;
		}
		public int getProd_price() {
			return prod_price;
		}
		public void setProd_price(int prod_price) {
			this.prod_price = prod_price;
		}
		public int getProd_quantity() {
			return prod_quantity;
		}
		public void setProd_quantity(int prod_quantity) {
			this.prod_quantity = prod_quantity;
		}
		
       
}

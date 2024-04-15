package Payment.gateway.Payment.Gateway.Payment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {

	public double price;
	public String currency;
	public String method;
	public String intent;
	public String description;
	
	public String getIntent() {
		return intent;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public String getMethod() {
		return method;
	}
	
	public String getDescription() {
		return description;
	}
}

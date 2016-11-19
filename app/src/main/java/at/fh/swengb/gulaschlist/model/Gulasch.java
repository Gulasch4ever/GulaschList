package at.fh.swengb.gulaschlist.model;

import java.io.Serializable;

/**
 * Created by laszlobalo on 19.11.16.
 */

public class Gulasch implements Serializable {

    private String cookFirstName;
    private String cookLastName;
    private String restaurantAddress;
    private String phoneNumber;
    private String orderId;

    public Gulasch() {
    }

    public Gulasch(String cookFirstName, String cookLastName, String restaurantAddress, String phoneNumber, String orderId) {
        this.cookFirstName = cookFirstName;
        this.cookLastName = cookLastName;
        this.restaurantAddress = restaurantAddress;
        this.phoneNumber = phoneNumber;
        this.orderId = orderId;
    }

    public String getCookFirstName() {
        return cookFirstName;
    }

    public void setCookFirstName(String cookFirstName) {
        this.cookFirstName = cookFirstName;
    }

    public String getCookLastName() {
        return cookLastName;
    }

    public void setCookLastName(String cookLastName) {
        this.cookLastName = cookLastName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Gulasch gulasch = (Gulasch) o;

        if (!cookFirstName.equals(gulasch.cookFirstName)) return false;
        if (!cookLastName.equals(gulasch.cookLastName)) return false;
        return orderId.equals(gulasch.orderId);

    }

    @Override
    public int hashCode() {
        int result = cookFirstName.hashCode();
        result = 31 * result + cookLastName.hashCode();
        result = 31 * result + orderId.hashCode();
        return result;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer();
        sb.append(cookFirstName).append(" ").append(cookLastName).append('\n')
                .append(restaurantAddress).append('\n')
                .append(phoneNumber);
        return sb.toString();
    }
}

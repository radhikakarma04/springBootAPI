package net.engineeringdigest.journalApp.entities;

import java.util.List;

public class OutputResponse {
    private String user_id;
    private boolean is_success;
    private List<String> odd_numbers;
    private List<String> even_numbers;

    public OutputResponse(String user_id, boolean is_success, List<String> odd_numbers, List<String> even_numbers) {
        this.user_id = user_id;
        this.is_success = is_success;
        this.odd_numbers = odd_numbers;
        this.even_numbers = even_numbers;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public boolean isIs_success() {
        return is_success;
    }

    public void setIs_success(boolean is_success) {
        this.is_success = is_success;
    }

    public List<String> getOdd_numbers() {
        return odd_numbers;
    }

    public void setOdd_numbers(List<String> odd_numbers) {
        this.odd_numbers = odd_numbers;
    }

    public List<String> getEven_numbers() {
        return even_numbers;
    }

    public void setEven_numbers(List<String> even_numbers) {
        this.even_numbers = even_numbers;
    }
}

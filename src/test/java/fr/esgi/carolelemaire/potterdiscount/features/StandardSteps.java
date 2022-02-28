package fr.esgi.carolelemaire.potterdiscount.features;

import fr.esgi.carolelemaire.potterdiscount.Book;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.assertj.core.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StandardSteps {

    private Book book;


    @Given("Purchase book {string}")
    public void purchaseOfBook(String tome) {
        if(!tome.isBlank()){
            this.book = new Book(Arrays.stream(tome.split(",")).map(s -> Integer.valueOf(s.trim())).collect(Collectors.toList()));
        }
        else {
            this.book = new Book(new ArrayList<Integer>());
        }

    }


    @Then("The total price should be {double}")
    public void theTotalPriceShouldBe(double price) {
        Assertions.assertThat(this.book.price()).isEqualTo(price);
    }
}

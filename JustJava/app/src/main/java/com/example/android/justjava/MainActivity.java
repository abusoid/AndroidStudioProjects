/**
 * IMPORTANT: Make sure you are using the correct package name. 
 * This example uses the package name:
 * package com.example.android.justjava
 * If you get an error when copying this code into Android studio, update it to match teh package name found
 * in the project's AndroidManifest.xml file.
 **/

package com.example.android.justjava;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int quantity=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Формирует конечное сообщение.
     * @param price итоговая цена за кофе
     * @param hasChocolate добавлять ли в кофе шоколад
     * @param hasWhipped добавлять ли в кофе крем
     *
     *  is the number of cups of coffee ordered
     */
    private String createOrderSummary(int price, boolean hasChocolate, boolean hasWhipped, String nameField){
        String priceMessage =  getString(R.string.order_summary_name) + nameField + "\n";
        priceMessage += getString(R.string.add_whipped_cream) + hasWhipped + "\n";
        priceMessage += getString(R.string.add_chocolate) + hasChocolate + "\n";
        priceMessage += getString(R.string.quantity) + quantity + "\n";
        priceMessage += getString(R.string.total) + price;
        priceMessage += "\n" + getString(R.string.thank_you);
        return priceMessage;
    }


    /**
     * This method is called when the order button "+" is clicked.
     */
    public void increment(View view) {
        quantity++;
        if (quantity >= 100){
            Toast.makeText(this, "Нельзя заказать больше ста чашек кофе", Toast.LENGTH_SHORT).show();
            quantity = 100;
        }
        displayQuantity(quantity);
    }
    /**
     * This method is called when the order button "-" is clicked.
     */
    public void decrement(View view) {
        quantity--;
        if (quantity <= 1){
            Toast.makeText(this, "Нельзя заказать меньше одной чашки кофе", Toast.LENGTH_SHORT).show();
            quantity = 1;
        }
        displayQuantity(quantity);
    }
    public void submitOrder(View view) {
        CheckBox checkBoxChocolate = (CheckBox) findViewById(R.id.chocolate_checkbox);
        boolean hasChocolate = checkBoxChocolate.isChecked();
        CheckBox checkBoxWhipped = (CheckBox) findViewById(R.id.check_whipped);
        boolean hasWhipped = checkBoxWhipped.isChecked();
        EditText nameEdit = (EditText) findViewById(R.id.name);
        String nameField = nameEdit.getText().toString();
        int price = calculatePrice(hasChocolate, hasWhipped);
        //displayMessage(createOrderSummary(price, hasChocolate, hasWhipped, nameField));
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "abusoid@yandex.ru");
        intent.putExtra(Intent.EXTRA_SUBJECT, getString(R.string.just_juvu_to));
        intent.putExtra(Intent.EXTRA_TEXT, createOrderSummary(price, hasChocolate, hasWhipped, nameField));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Calculates the price of the order.
     * @param hasChocolate добавлен ли шоколад в кофе
     * @param hasWhipped добавлен ли крем в кофе
     * @return total price
     *  is the number of cups of coffee ordered
     */
    private int calculatePrice(boolean hasChocolate, boolean hasWhipped) {
        int costOneCup = 5;
        if (hasChocolate) {
            costOneCup += 2;
        }
        if (hasWhipped) {
            costOneCup += 1;
        }
        int price = quantity * costOneCup;
        return price;

    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int kolya) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + kolya);
    }
}
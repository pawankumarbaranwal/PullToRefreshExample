package android.com.pulltorefreshexample;

import android.graphics.Color;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity implements SwipeRefreshLayout.OnRefreshListener {

    List<Customer> customerList = new ArrayList<Customer>();
    SwipeRefreshLayout swipeRefreshLayout;
    RecyclerViewAdapter adapter;
    RecyclerView recList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        customerList = getData();
        setContentView(R.layout.activity_main);
        recList = (RecyclerView) findViewById(R.id.cardList);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(this);
        swipeRefreshLayout.setColorSchemeColors(Color.RED, Color.GREEN, Color.BLUE, Color.CYAN);
    

    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
    linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recList.setLayoutManager(linearLayoutManager);

        adapter = new RecyclerViewAdapter(customerList);
        recList.setAdapter(adapter);
    }

    private List<Customer> getData() {
        int i=100;
        List<Customer> list = new ArrayList<Customer>();
        Customer customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Pawan", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Javed", "9902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Sahil", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nikhil", "9802765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        customer = new Customer(i+++"", "Nadeem", "909777735");
        list.add(customer);
        customer = new Customer(i+++"", "Naman", "870365235");
        list.add(customer);
        customer = new Customer(i+++"", "Sidhant", "5902765235");
        list.add(customer);
        customer = new Customer(i+++"", "Santosh", "9990765235");
        list.add(customer);
        return list;
    }
    @Override
    public void onRefresh() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                swipeRefreshLayout.setRefreshing(false);
            }
        }, 4000);
    }
}
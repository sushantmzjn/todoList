package com.todolist.todolist;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.todolist.todolist.Adapter.ToDoAdapter;
import com.todolist.todolist.Model.ToDoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton buttonshow;
    RecyclerView recyclerView;
    private List<ToDoModel> taskList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        buttonshow = findViewById(R.id.fab);

        taskList = new ArrayList<>();

        recyclerView = findViewById(R.id.itemRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ToDoAdapter taskAdapter = new ToDoAdapter(this);
        recyclerView.setAdapter(taskAdapter);


        ToDoModel task = new ToDoModel();
        task.setTask("this is a test");
        task.setStatus(0);
        task.setId(1);

        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);
        taskList.add(task);

        taskAdapter.setTasks(taskList);


        buttonshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomDialogFragment fragment = new BottomDialogFragment();
                fragment.show(getSupportFragmentManager(), fragment.getTag());
            }
        });
    }
}
package com.todolist.todolist.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.todolist.todolist.MainActivity;
import com.todolist.todolist.Model.ToDoModel;
import com.todolist.todolist.R;

import java.util.List;

public class ToDoAdapter extends RecyclerView.Adapter<ToDoAdapter.itemViewHolder> {

    Context context;
    List<ToDoModel> toDoModelList;
    MainActivity activity;

    public ToDoAdapter(MainActivity activity) {

    }

//    public ToDoAdapter(Context context, List<ToDoModel> toDoModelList) {
//        this.context = context;
//        this.toDoModelList = toDoModelList;
//    }

    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_recyclerview, parent, false);
        return new itemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemViewHolder holder, int position) {
        ToDoModel toDoModel = toDoModelList.get(position);
        holder.task.setText(toDoModel.getTask());
        holder.task.setChecked(toBoolean(toDoModel.getStatus()));

    }

    /**
     * convert string to boolean
     **/
    private boolean toBoolean(int n) {
        return n != 0;
    }

    @Override
    public int getItemCount() {
        return toDoModelList.size();
    }

    public void setTasks(List<ToDoModel> toDoModelList){
        this.toDoModelList = toDoModelList;
        notifyDataSetChanged();
    }

    public class itemViewHolder extends RecyclerView.ViewHolder {
        CheckBox task;

        public itemViewHolder(@NonNull View itemView) {
            super(itemView);
            task = itemView.findViewById(R.id.todoCheckbox);
        }
    }
}

package resfreshapp.refresh;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

class MyViewHolder extends RecyclerView.ViewHolder {
    public ImageView image;
    RecyclerView recyclerView;
    public TextView title;


    public MyViewHolder(View view) {
        super(view);
        title = (TextView) view.findViewById(R.id.name);
        image = (ImageView) view.findViewById(R.id.meal);
    }
}
public class MealAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Meal> mealList;

    public MealAdapter(List<Meal> mealList) {
        this.mealList = mealList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.meal_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Meal Meal = mealList.get(position);
        if(Meal.getTitle().equals(null)){

        }
        else {
            holder.title.setText(Meal.getTitle());
           holder.image.setBackground(Meal.getId());
        }
    }

    @Override
    public int getItemCount() {
        return mealList.size();
    }
}
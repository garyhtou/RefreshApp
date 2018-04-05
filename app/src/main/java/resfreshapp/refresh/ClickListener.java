package resfreshapp.refresh;

import android.view.View;

/**
 * Created by michael on 4/4/2018.
 */

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}
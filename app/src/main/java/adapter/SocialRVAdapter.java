package adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.elflin.petqper.R;

import java.util.ArrayList;

import model.Post;
import model.User;

public class SocialRVAdapter extends RecyclerView.Adapter<SocialRVAdapter.MahasiswaViewHolder>{

    private ArrayList<Post> dataList;
//    private ArrayList<User> userList;

    public SocialRVAdapter(ArrayList<Post> dataList) {
        this.dataList = dataList;
//        this.userList = userList;
    }

    @NonNull
    @Override
    public SocialRVAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_social, parent, false);
        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SocialRVAdapter.MahasiswaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {

        private TextView socialcard_username, socialcard_caption, socialcard_postdate;
        private ImageView socialcard_image, socialcard_pp;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            this.socialcard_username = itemView.findViewById(R.id.socialcard_username);
            this.socialcard_caption = itemView.findViewById(R.id.socialcard_caption);
            this.socialcard_postdate = itemView.findViewById(R.id.socialcard_postdate);
            this.socialcard_image = itemView.findViewById(R.id.socialcard_image);
            this.socialcard_pp = itemView.findViewById(R.id.socialcard_pp);
        }
    }
}

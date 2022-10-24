package nhl69.luansapp.contact;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class ContactAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Contact> arrayList;

    public ContactAdapter(Context context, int layout, List<Contact> arrayList) {
        this.context = context;
        this.layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout, null);
        Contact contact = arrayList.get(i);

        TextView name = convertView.findViewById(R.id.name);
        TextView number = convertView.findViewById(R.id.number);
        ImageView image = convertView.findViewById(R.id.image);

        name.setText(contact.getName());
        number.setText(contact.getNumber());
        image.setImageResource(contact.getImage());

        return convertView;
    }
}

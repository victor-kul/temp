package shwarz.al_l5_online;
//old object moel

import android.graphics.drawable.Drawable;

public class

//...main...
  //onCreate
  {
    ListView lv = (ListView) findViewById(R.id.iv);


    lv.setAdaapter(new CustomAdapter(loadData()));
    asset..
//
    lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
      @Override
      public void onItemClick(AdapterView<?> parent, View view, int position, long..)
        Toast.makeText(getApplicationContext(), "Нажат: "+position, Toast..);
        profile.remove(position);
        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), android.R.anim, ))
        customAdapter.notifyDataSetChanged();
    })
  }

  public List<Profile> loadData(){
    for(int i=0; i<50;i++){
      profile.add(new Profile(R.drawable.widget_shw, "Victor", "K"));
      profile.add(new Profile(R.drawable.widget_shw, "Nastya", "U"));
    }
    return profiles;
  }
}//Main class

//==========
//new class :
pulic class CustomAdapter extends BaseAdapter{

  List<Profile> profiles;
  @Override
  // public CustomAdapter(Context context)
  public CustomAdapter(Context context)
  {

  }
  // public Drawable getPhoto(){}

  @Override
  public int getCount(){
    // return 0;
    retrun profiles.size();
  }
  public Object getItem(int position){
    // return null;
    return position;
  }
  public long getItemId(int position){
    return position;
  }
	@Overide
	public View getView(int position, View convertView, ViewGroup parent){
    // Log.d("...", "getView сработал, ");

    //!! - смотри логи ..
    View v = convertView; // экономит рсурсы, ()множество не срабатывет...)
    if( v == null ) v= View.inflate(parent.getContext(), R.layout.item_view, null);

    ImageView photo = (ImageView) v.findViewById(R.id.photo);
    photo.setImageResource(profiles.get(position).getPhoto());



	   return null;
	}


}
//==========
//class:
Profile

<resources>
  <style name

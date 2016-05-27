Spinner spinner = (Spinner) findViewById(R.id.spinner);

List<String> category = new ArrayList<>();
category.add("Еда");
category.add("Авто");
category.add("Одежда");

ArrayAdapter<String> arayAdapter = new ArrayAdapter<String>()(this, android.R.layout.simple_pinner_item. categpru); //simple_spinner_dropdown_item

spinner.setAdapter(arrayAdapter);

// -- -- -- -- -- -- -- -- -- -- -- --
//GridView:

<GridView
	xmlns:android="http://schemas.android.com/apk/res/android"
	xmlns:tools="http://schemas.android.com/tools"
	android:id="@+/grid"
	android:layout_width="match_parent"
	android:layout_height="match_parent"

	android:columnWidth="96dp"
	android:numColumn="auto_fit"
	android:gravity="center"
	tools:context=""
>
</GridView>

//----
GridView gridView = (GridView) findViewById(R.id.grid);
gridView.setAdapter(new ImageAdapter(this));

//----new class--
//ImageAdapter:

public class ImageAdapter implements ListAdapter{
	public ImageAdapter(MainActivity mainActivity){

	}

	@Override
	public int getCount(){
		return 40;
	}

	@Overide
	public View getView(int position, View convertView, ViewGroup parent){
	// Log.d("...", "getView сработал, ");
	return null;
	}
}

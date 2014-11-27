package com.example.cardstylelistview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity
{
	private ListView listView;

	private static final String[] data = { "����", "�Ϻ�", "�人", "����", "����", "�Ͼ�", "�Ϸ�","�Ϻ�", "�人", "����", "����", "�Ͼ�", "�Ϸ�" };

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.card_listView);
		/*���ͷ��β*/
		listView.addHeaderView(new View(this));
		listView.addFooterView(new View(this));

		listView.setAdapter(new ArrayAdapter<String>(this, R.layout.list_item_card, R.id.line1, data));
				
	}
}











package org.geometerplus.fbreader.bookmarks.addon;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class Answer extends Activity {

	@Override
	protected void onCreate(Bundle b) {
		super.onCreate(b);
		final SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
		String language = preferences.getString("language", "default");
		Intent intent = getIntent();
		intent.putExtra("language", language);
		setResult(RESULT_OK, intent);
		finish();
	}
	
}

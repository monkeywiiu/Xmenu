# Xmenu
## How to use
### Step1
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  	dependencies {
	        compile 'com.github.monkeywiiu:Xmenu:-SNAPSHOT'
	}
### Step2

```
   <com.example.zmenu.SnakeButtonLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/container"
    android:layout_width="match_parent"
    android:layout_height="match_parent">
</com.example.zmenu.SnakeButtonLayout>
```
`just like RelativeLayout`
### Step3

        //设置图片和颜色
        PUtils.getInstance().setImagesAndColors(List<Integer> imageList, List<Integer> colorList);

        //设置悬浮按钮的margin
        PUtils.getInstance().setMargin((int) getResources().getDimension(R.dimen.margin));
        
        setContentView(R.layout.activity_main);
 ` Remember `:  set this before  `setContentView(..) `
 
  ### Add click event
 
 ```
        container = (SnakeButtonLayout) findViewById(R.id.container);
        container.setIsClickable(true); //default is false
        container.setOnTopViewClickListener(new SnakeButtonLayout.onTopViewClickListener() {
            @Override
            public void onclick() {
                Toast.makeText(MainActivity.this, "你点击了导航栏", Toast.LENGTH_SHORT).show();
            }
        });
```
 
 ![image](https://github.com/monkeywiiu/Xmenu/blob/master/menu.gif)
 

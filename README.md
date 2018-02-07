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
	        compile 'com.github.monkeywiiu:Xmenu:v5.1'
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
```
        //设置图片和颜色
        PUtils.getInstance().setImagesAndColors(List<Integer> imageList, List<Integer> colorList);
        //设置是否可见，默认是不可见
	PUtils.getInstance().setVisible(true);
        //设置悬浮按钮的margin
        PUtils.getInstance().setMargin((int) getResources().getDimension(R.dimen.marginRight),
                (int) getResources().getDimension(R.dimen.marginBottom));
        setContentView(R.layout.activity_main);
```
 ` Remember `:  set these before  `setContentView(..) `
 
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
 
 ### ADDS
 ```
 手动隐藏XMenu
        viewList = PUtils.getInstance().getViewList();
        for (int i = 0; i < viewList.size(); i++) {
            viewList.get(i).hide();
        }
 ```
 

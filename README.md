# Android-Dialogs-Interface

dialog interface for android

## Usage

```groovy
implementation "tiiehenry.android.ui.dialogs:public_api:1.0"
```

implements interfaces in tiiehenry.android.ui.dialogs.api.strategy

set Object to tiiehenry.android.ui.dialogs.api.strategy.Dialogs

```kotlin
Dialogs.global.asInput()
                .title("请输入项目名")
                .input("请输入项目名",
                        "demoProject",
                        new InputCallback() {
                            @Override
                            public void onInput(@NonNull IInputDialog dialog, CharSequence input) {
                               
                        })
                .negativeText()
                .positiveText()
                .show();
```



## strategy

| confirm        | input      | list               | loading      | progress      | custom      |
| -------------- | ---------- | ------------------ | ------------ | ------------- | ----------- |
| confirm dialog | input text | single/multi items | loading view | show progress | custom view |


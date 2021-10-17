# DuplicatIssue00

## セットアップ方法

```
git clone https://github.com/futokiyo-trial/duplicate-issue00.git
```
## テスト方法

```
cd duplicate-issue00
mvn clean compile test
```

デバッグ内容を確認
```aidl
check size : 2 at first time.
first time check -> Person{firstName='Tom', lastName='Smith', hobby='baseball', favoriteFood='potato'}
first time check -> Person{firstName='Alice', lastName='Brown', hobby='music', favoriteFood='cake'}
check size : 2 at second time.
second time check -> Person{firstName='Tom', lastName='Smith', hobby='football', favoriteFood='beaf'}
second time check -> Person{firstName='Alice', lastName='Brown', hobby='music', favoriteFood='cake'}
```

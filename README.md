# play-java-docker
for docker

基本は https://github.com/yamaza520/java-play-test と同じ

# docker用image

ローカルにimageをpushする
```
sbt api/docker:publishLocal
```

コンテナだけ作る
```
sbt api/docker:stage
```

import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primarySwatch: Colors.indigo,
      ),
      home: MinhaPagina(),
    );
  }
}

class MinhaPagina extends StatelessWidget {
  const MinhaPagina({ Key? key }) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Minha Página Web com Flutter"),
      ),
      body: Column(
        children: [
          Text("Você assistiu Demon Slayer"),
          Image.network("https://pbs.twimg.com/media/E2F5tJ6X0AM94ax.jpg:large"),
        ],
      ),
    );
  }
}
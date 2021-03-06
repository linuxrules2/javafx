/*
 * Copyright (c) 2008, 2016, Oracle and/or its affiliates.
 * All rights reserved. Use is subject to license terms.
 *
 * This file is available and licensed under the following license:
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  - Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *  - Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the distribution.
 *  - Neither the name of Oracle Corporation nor the names of its
 *    contributors may be used to endorse or promote products derived
 *    from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package ensemble.samples.graphics2d.shapes.circle;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * A sample showing two circles with controls to change fill, stroke, and radius.
 *
 * @sampleName Circle
 * @preview preview.png
 * @playground circle1.fill (name="Circle 1 Fill")
 * @playground circle1.radius (name="Circle 1 Radius", min=10, max=40)
 * @playground circle2.stroke (name="Circle 1 Stroke")
 * @playground circle2.strokeWidth (name="Circle 2 Stroke Width", min=1, max=5)
 * @playground circle2.radius (name="Circle 2 Radius", min=10, max=40)
 * @see javafx.scene.shape.Circle
 * @see javafx.scene.shape.Shape
 * @see javafx.scene.paint.Color
 * @embedded
 *
 * @related /Graphics 2d/Shapes/Arc
 * @related /Graphics 2d/Shapes/Cubic Curve
 * @related /Graphics 2d/Shapes/Ellipse
 * @related /Graphics 2d/Shapes/Line
 * @related /Graphics 2d/Shapes/Path
 * @related /Graphics 2d/Shapes/Polygon
 * @related /Graphics 2d/Shapes/Polyline
 * @related /Graphics 2d/Shapes/Quad Curve
 * @related /Graphics 2d/Shapes/Rectangle
 */
public class CircleApp extends Application {

    private Circle circle1 = new Circle(45, 45, 40, Color.RED);
    private Circle circle2 = new Circle(135, 45, 40);

    public Parent createContent() {
        Pane root = new Pane();
        root.setPrefSize(245, 100);
        root.setMinSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        root.setMaxSize(Region.USE_PREF_SIZE, Region.USE_PREF_SIZE);
        circle2.setStroke(Color.DODGERBLUE);
        circle2.setFill(null);
        root.getChildren().addAll(circle1, circle2);
        return root;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(createContent()));
        primaryStage.show();
    }

    /**
     * Java main for when running without JavaFX launcher
     * @param args command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}

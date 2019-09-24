package com.jhonatansouza.faces.service;

import com.jhonatansouza.faces.model.FaceResult;

public interface FaceRecognitionService {

    FaceResult recognize(String photoBase64);

}

import { atom } from "recoil";

export const questionTitleState = atom({
  key: "questionTitleState",
  default: "",
});

export const questionBodyState = atom({
  key: "questionBodyState",
  default: "",
});

export const tagsState = atom({
  key: "tagsState",
  default: [],
});

export const questionDataState = atom({
  key: "questionDataState",
  default: {},
});

export const answersDataState = atom({
  key: "answersDataState",
  default: [],
});

export const commentsDataState = atom({
  key: "commentsDataState",
  default: [],
});

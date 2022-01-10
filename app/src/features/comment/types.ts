export interface Comment {
  id: number;
  body: string;
  author_id: number;
  edited: boolean;
}
// off-by-one, fixed
